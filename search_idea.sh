#!/bin/bash

for i in `ls ~/IdeaProjects/`
do
    c="/home/lyt/program/jar/$i"
    mkdir $c
    d="/home/lyt/IdeaProjects/$i/src/*"
    cp $d $c
done
