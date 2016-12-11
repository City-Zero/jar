#!/bin/bash

for i in `ls ~/IdeaProjects/`
do
    mkdir /home/lyt/program/jar/$i
    cp /home/lyt/IdeaProjects/$i/src/* /home/lyt/program/jar/$i/
done
sh git.sh `date |awk '{print $1$2$3}'`
