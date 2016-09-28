#!/bin/bash 
rm -r *.class
git add .
git commit -m "$1"
git push origin master
