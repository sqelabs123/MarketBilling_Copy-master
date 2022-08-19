WinWait("[CLASS:#32770]","",10)

; Set input focus to the edit control of Upload window using the handle returned by WinWait

  ControlFocus("Open","","Edit1")

  Sleep(2000)

; Set the File name text on the Edit field

  ControlSetText("Open", "", "Edit1", "D:\A_Projects\Market_Billing\TestData\Meter Number with NMI.csv")

  Sleep(2000)

; Click on the Open button

  ControlClick("Open", "","Button1");


