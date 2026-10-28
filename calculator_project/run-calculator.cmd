@echo off
setlocal
cd /d "%~dp0"

call mvn -pl Calculator_combine_code -am compile
if errorlevel 1 exit /b %errorlevel%

java -cp "Calculator_combine_code\target\classes;add\target\classes;sub\target\classes;mul\target\classes" calculator.calculator_combine
exit /b %errorlevel%
