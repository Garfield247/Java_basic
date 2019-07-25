#!/bin/sh

filename="./README.md"
echo '# Java基础案例练习' > ${filename}


for p in `find ./* -maxdepth 1 -name "Test*.java"`;
    do
        # echo $p
        index=`cat ${p}|sed -n '3p'`
        echo "- [${p}](${p})\n   ${index:2}" >>${filename}
    done

echo "ok!"
