#!/bin/bash
param=$1
echo $param
if [ $param == "parentheses" ]
then 
  echo "Testing Valid Parentheses"
  mvn test -q -Dtest="ValidParenthesesTest"
  exit 0
fi

if [ $param == "duplicates" ]
then 
  echo "Testing Remove Duplicates"
  mvn test -q -Dtest="RemoveDuplicatesTest"
  exit 0
fi

if [ $param == "palindrome" ]
then 
  echo "Testing Longest Palindrome"
  mvn test -q -Dtest="LongestPalindromeTest"
  exit 0
fi

if [ $param == "report" ]
then 
  echo "Testing all and generating report"
  mvn surefire-report:report
  open target/site/surefire-report.html
  exit 0
fi

echo "Testing all..."
mvn test -q
