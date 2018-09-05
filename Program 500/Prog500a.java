
/**
 * Shai Caspin
 * 11/23/16
 * Carrboro HS (NCVPS)
 * Program 500a- Extra Credit- Mr. ASCII
 * 
 * Description: A computer recognizes characters as a numerical value from an ASCII table.  
 *              The majority of the printable charters appear in the range of 32 (a space) 
 *              to 122(lower case z). This program prints them all in a 4x61 table (double columns)
 * Qhat I learned: I learned how to sue the char data type
 * Difficulties: I didn't understand whether the instructions wanted just a collumn of all the values
 *               ot a table that copies that of the description, so I did both!
 */

public class Prog500a
{
   public static void main(String[] args)
   {
       //print one at a time and one twice the value
       for (char letter = 32; letter<=61; letter++)
       {
           System.out.println(letter+"\t"+(int)letter+"\t"+(char)(2*letter)+"\t"+(int)(2*letter));
        }

    }
}
/**
 * Sample output
 * 
 * (in a table)
 * 
 	32	@	64
!	33	B	66
"	34	D	68
#	35	F	70
$	36	H	72
%	37	J	74
&	38	L	76
'	39	N	78
(	40	P	80
)	41	R	82
*	42	T	84
+	43	V	86
,	44	X	88
-	45	Z	90
.	46	\	92
/	47	^	94
0	48	`	96
1	49	b	98
2	50	d	100
3	51	f	102
4	52	h	104
5	53	j	106
6	54	l	108
7	55	n	110
8	56	p	112
9	57	r	114
:	58	t	116
;	59	v	118
<	60	x	120
=	61	z	122

 * 
 * 
 * 
 * 
 * (in a 2 column table)
 * 
 * 
 	32
!	33
"	34
#	35
$	36
%	37
&	38
'	39
(	40
)	41
*	42
+	43
,	44
-	45
.	46
/	47
0	48
1	49
2	50
3	51
4	52
5	53
6	54
7	55
8	56
9	57
:	58
;	59
<	60
=	61
>	62
?	63
@	64
A	65
B	66
C	67
D	68
E	69
F	70
G	71
H	72
I	73
J	74
K	75
L	76
M	77
N	78
O	79
P	80
Q	81
R	82
S	83
T	84
U	85
V	86
W	87
X	88
Y	89
Z	90
[	91
\	92
]	93
^	94
_	95
`	96
a	97
b	98
c	99
d	100
e	101
f	102
g	103
h	104
i	105
j	106
k	107
l	108
m	109
n	110
o	111
p	112
q	113
r	114
s	115
t	116
u	117
v	118
w	119
x	120
y	121
z	122

 * 
 * 
 */