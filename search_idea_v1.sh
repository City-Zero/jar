#!/bin/bash

for i in `locate '/home/lyt/IdeaProjects/*.java'`
do
    a=`echo ${i%/*}`
    a=`echo ${a:23}`
    mkdir -p /home/lyt/program/jar/$a
    cp $i /home/lyt/program/jar/$a/
done
sh git.sh `date |awk '{print $1$2$3}'`
