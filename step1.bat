REM STEP1 - Print the source directory lists

dir ^
D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial1\steps\ ^
D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial2\steps\ ^
D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial3\steps\ ^
D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial4\steps\ ^
/b >> data1.txt

xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial1\steps\*.* . /e /h /k
xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial2\steps\*.* . /e /h /k
xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial3\steps\*.* . /e /h /k
xcopy D:\OpenDEV\eclipse_workspace\SPRINGWork\simpleSpringTutorial4\steps\*.* . /e /h /k

