#!/bin/bash

echo "Ingrese el nombre del proyecto"

proyect_name=""
read -r proyect_name

mvn archetype:generate -DgroupId=co.edu.uniquindio.programacion2 -DartifactId="$proyect_name" -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

git add --all
git commit -m "Se generó el proyecto $proyect_name"
