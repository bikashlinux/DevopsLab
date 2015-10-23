import re
import sys

pattern1 = re.compile("(?<![A-Z0-9])[A-Z0-9]{20}(?![A-Z0-9])")
pattern2 = re.compile("(?<![A-Za-z0-9/+=])[A-Za-z0-9/+=]{40}(?![A-Za-z0-9/+=])")
pattern3 = re.compile("[0-9a-zA-Z/+]{64}")
pattern4 = re.compile("-----BEGIN RSA PRIVATE KEY-----")
flag = "false"
for i, line in enumerate(open(sys.argv[1])):
    for match in re.finditer(pattern1, line):
    	flag = "true"
    for match in re.finditer(pattern2, line):
    	flag = "true"
    for match in re.finditer(pattern3, line):
    	flag = "true"
    for match in re.finditer(pattern4, line):
    	flag = "true"
print flag
