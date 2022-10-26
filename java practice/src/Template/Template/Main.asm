.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD
INCLUDE Irvine32.inc

.data
; store values A,B,C,D in the registers
A DWORD 100
message byte "For A=100,B=50,C=30 and D=20",0
ans byte "The Result Of Integer Expression (A+B)-(C+D) :",0
B DWORD 50
CC DWORD 30
D DWORD 20

.code
main PROC
mov edx, offset message
call WriteString
call crlf
MOV EAX, A
MOV EBX, B
MOV ECX, CC
MOV EDX, D

;Now solution will be identified 

add EAX, EBX ;A=A+B
ADD ECX, EDX ;C=C+D
sub EAX, ECX ;(A+B)-(C+D)
mov edx, offset ans
call WriteString
call WriteInt
exit
main ENDP
END Main
