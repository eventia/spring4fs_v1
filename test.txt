@echo off
if [%1] EQU [] (
echo [PROCESSING...] git commit -m "[Basic] Spring Tutorial %date%" 
) else (
echo [PROCESSING...] git commit -m %*
)
echo [PROCESSING...] git push 
