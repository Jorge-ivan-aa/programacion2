#!/bin/bash

echo "Ingrese el nombre del proyecto"
proyect_name=""
read -r proyect_name

echo "Que tipo de proyecto quiere generar"
echo -e "1. Proyecto simple\n2. Proyecto javafx"
read -r option

if [ "$option" == 1 ];then
  mvn archetype:generate -DgroupId=co.edu.uniquindio."${proyect_name,,}" -DartifactId="$proyect_name" -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
  is_generate=true
elif [ "$option" == 2 ];then
  mvn archetype:generate -DgroupId=co.edu.uniquindio."$proyect_name" -DartifactId="$proyect_name" -DarchetypeGroupId=org.openjfx -DarchetypeArtifactId=javafx-archetype-fxml -DarchetypeVersion=0.0.3 -Djavafx-version=21.0.2 -DinteractiveMode=false 
  is_generate=true
  cd "$proyect_name" || exit
else
  echo "No se especificó un tipo de proyecto existente"
  is_generate=false
fi

if [ "$is_generate" == true ];then
  git add --all
  git commit -m "Se generó el proyecto $proyect_name"
fi
