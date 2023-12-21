#!/usr/bin/zsh

for dir in */ ; do
    cd "$dir"
    (
      echo "Installing ${dir%*/} ..."
      mvn clean > /dev/null && mvn install > /dev/null
      echo "  ... ${dir%*/} correctly installed"
    ) &
    cd ..
done

wait
echo "Done"

