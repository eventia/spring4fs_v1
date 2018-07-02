REM STEP1 - Print the source directory lists
REM 
REM 
REM dir ^
REM D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial1\steps\ ^
REM D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial2\steps\ ^
REM D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial3\steps\ ^
REM D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial4\steps\ ^
REM /b >> data1.txt
REM 
REM xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial1\steps\*.* . /e /h /k
REM xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial2\steps\*.* . /e /h /k
REM xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial3\steps\*.* . /e /h /k
REM xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial4\steps\*.* . /e /h /k
REM 
REM FOR %A in (1 2 3 4) DO xcopy ^
REM D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial%A\steps\*.*  . /e /h /k
