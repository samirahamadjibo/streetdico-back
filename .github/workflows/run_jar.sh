#!/usr/bin/env bash

# shellcheck disable=SC2046
kill -9 $(lsof -t -i:8080)
echo "Killed process running on port 8080"

java -jar streetdico-0.0.1-SNAPSHOT.jar
echo "Started server using java -jar command"