#!/bin/bash

for i in `locate '~/IdeaProjects/*.java'`
do
    a=`echo ${i%/*}`
    a=`echo ${a:10}`
    mkdir /home/lyt/program/jar/$i
    cp $i /home/lyt/program/jar/$a/
done
sh git.sh `date |awk '{print $1$2$3}'`
