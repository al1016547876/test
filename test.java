


1 
2 package com.example.week2; 
3 
 
4 import android.os.Bundle; 
5 import android.view.View; 
6 import android.view.View.OnClickListener; 
7 import android.widget.Button; 
8 import android.widget.TextView; 
9 import android.app.Activity; 
10 
 
11 public class MainActivity extends Activity  implements OnClickListener{ 
12 
 
13     //声明一些控件 
14     Button btn0=null; 
15     Button btn1=null; 
16     Button btn2=null; 
17     Button btn3=null; 
18     Button btn4=null; 
19     Button btn5=null; 
20     Button btn6=null; 
21     Button btn7=null; 
22     Button btn8=null; 
23     Button btn9=null; 
24     Button btnBackspace=null; 
25     Button btnCE=null; 
26     Button btnC=null; 
27     Button btnAdd=null; 
28     Button btnSub=null; 
29     Button btnMul=null; 
30     Button btnDiv=null; 
31     Button btnEqu=null; 
32     TextView tvResult=null; 
33     //声明两个参数。接收tvResult前后的值 
34     double num1=0,num2=0; 
35     double Result=0;//计算结果 
36     int op=0;//判断操作数， 
37     boolean isClickEqu=false;//判断是否按了“=”按钮 
38 
 
39     @Override 
40     protected void onCreate(Bundle savedInstanceState) { 
41         super.onCreate(savedInstanceState); 
42         setContentView(R.layout.main); 
43         //从布局文件中获取控件， 
44         btn0=(Button)findViewById(R.id.btn0); 
45         btn1=(Button)findViewById(R.id.btn1); 
46         btn2=(Button)findViewById(R.id.btn2); 
47         btn3=(Button)findViewById(R.id.btn3); 
48         btn4=(Button)findViewById(R.id.btn4); 
49         btn5=(Button)findViewById(R.id.btn5); 
50         btn6=(Button)findViewById(R.id.btn6); 
51         btn7=(Button)findViewById(R.id.btn7); 
52         btn8=(Button)findViewById(R.id.btn8); 
53         btn9=(Button)findViewById(R.id.btn9); 
54         btnBackspace=(Button)findViewById(R.id.btnBackspace); 
55         btnCE=(Button)findViewById(R.id.btnCE); 
56         btnC=(Button)findViewById(R.id.btnC); 
57         btnEqu=(Button)findViewById(R.id.btnEqu); 
58         btnAdd=(Button)findViewById(R.id.btnAdd); 
59         btnSub=(Button)findViewById(R.id.btnSub); 
60         btnMul=(Button)findViewById(R.id.btnMul); 
61         btnDiv=(Button)findViewById(R.id.btnDiv); 
62         tvResult=(TextView)findViewById(R.id.tvResult); 
63 
 
64         //添加监听\ 
65         btnBackspace.setOnClickListener(this); 
66         btnCE.setOnClickListener(this); 
67 
 
68         btn0.setOnClickListener(this); 
69         btn1.setOnClickListener(this); 
70         btn2.setOnClickListener(this); 
71         btn3.setOnClickListener(this); 
72         btn4.setOnClickListener(this); 
73         btn5.setOnClickListener(this); 
74         btn6.setOnClickListener(this); 
75         btn7.setOnClickListener(this); 
76         btn8.setOnClickListener(this); 
77         btn9.setOnClickListener(this); 
78 
 
79          
80         btnAdd.setOnClickListener(this); 
81         btnSub.setOnClickListener(this); 
82         btnMul.setOnClickListener(this); 
83         btnDiv.setOnClickListener(this); 
84         btnEqu.setOnClickListener(this); 
85     } 
86     @Override 
87     public void onClick(View v) { 
88         switch (v.getId()) { 
89         //btnBackspace和CE-------------------- 
90         case R.id.btnBackspace: 
91             String myStr=tvResult.getText().toString(); 
92             try { 
93                 tvResult.setText(myStr.substring(0, myStr.length()-1)); 
94             } catch (Exception e) { 
95                 tvResult.setText(""); 
96             } 
97 
 
98             break; 
99         case R.id.btnCE: 
100             tvResult.setText(null); 
101             break; 
102 
 
103             //btn0--9--------------------------- 
104         case R.id.btn0: 
105             if(isClickEqu) 
106             { 
107                 tvResult.setText(null); 
108                 isClickEqu=false; 
109             } 
110             String myString=tvResult.getText().toString(); 
111             myString+="0"; 
112             tvResult.setText(myString); 
113             break; 
114         case R.id.btn1: 
115             if(isClickEqu) 
116             { 
117                 tvResult.setText(null); 
118                 isClickEqu=false; 
119             } 
120             String myString1=tvResult.getText().toString(); 
121             myString1+="1"; 
122             tvResult.setText(myString1); 
123             break; 
124         case R.id.btn2: 
125             if(isClickEqu) 
126             { 
127                 tvResult.setText(null); 
128                 isClickEqu=false; 
129             } 
130             String myString2=tvResult.getText().toString(); 
131             myString2+="2"; 
132             tvResult.setText(myString2); 
133             break; 
134         case R.id.btn3: 
135             if(isClickEqu) 
136             { 
137                 tvResult.setText(null); 
138                 isClickEqu=false; 
139             } 
140             String myString3=tvResult.getText().toString(); 
141             myString3+="3"; 
142             tvResult.setText(myString3); 
143             break; 
144         case R.id.btn4: 
145             if(isClickEqu) 
146             { 
147                 tvResult.setText(null); 
148                 isClickEqu=false; 
149             } 
150             String myString4=tvResult.getText().toString(); 
151             myString4+="4"; 
152             tvResult.setText(myString4); 
153             break; 
154         case R.id.btn5: 
155             if(isClickEqu) 
156             { 
157                 tvResult.setText(null); 
158                 isClickEqu=false; 
159             } 
160             String myString5=tvResult.getText().toString(); 
161             myString5+="5"; 
162             tvResult.setText(myString5); 
163             break; 
164         case R.id.btn6: 
165             if(isClickEqu) 
166             { 
167                 tvResult.setText(null); 
168                 isClickEqu=false; 
169             } 
170             String myString6=tvResult.getText().toString(); 
171             myString6+="6"; 
172             tvResult.setText(myString6); 
173             break; 
174         case R.id.btn7: 
175             if(isClickEqu) 
176             { 
177                 tvResult.setText(null); 
178                 isClickEqu=false; 
179             } 
180             String myString7=tvResult.getText().toString(); 
181             myString7+="7"; 
182             tvResult.setText(myString7); 
183             break; 
184         case R.id.btn8: 
185             if(isClickEqu) 
186             { 
187                 tvResult.setText(null); 
188                 isClickEqu=false; 
189             } 
190             String myString8=tvResult.getText().toString(); 
191             myString8+="8"; 
192             tvResult.setText(myString8); 
193             break; 
194         case R.id.btn9: 
195             if(isClickEqu) 
196             { 
197                 tvResult.setText(null); 
198                 isClickEqu=false; 
199             } 
200             String myString9=tvResult.getText().toString(); 
201             myString9+="9"; 
202             tvResult.setText(myString9); 
203             break; 
204 
 
205             //btn+-*/=-------------------------------- 
206         case R.id.btnAdd:             
207             String myStringAdd=tvResult.getText().toString(); 
208             if(myStringAdd.equals(null)) 
209             { 
210                 return; 
211             } 
212             num1=Double.valueOf(myStringAdd); 
213             tvResult.setText(null); 
214             op=1; 
215             isClickEqu=false; 
216             break; 
217 
 
218         case R.id.btnSub: 
219             String myStringSub=tvResult.getText().toString(); 
220             if(myStringSub.equals(null)) 
221             { 
222                 return; 
223             } 
224             num1=Double.valueOf(myStringSub); 
225             tvResult.setText(null); 
226             op=2; 
227             isClickEqu=false; 
228             break; 
229         case R.id.btnMul: 
230             String myStringMul=tvResult.getText().toString(); 
231             if(myStringMul.equals(null)) 
232             { 
233                 return; 
234             } 
235             num1=Double.valueOf(myStringMul); 
236             tvResult.setText(null); 
237             op=3; 
238             isClickEqu=false; 
239             break; 
240         case R.id.btnDiv: 
241             String myStringDiv=tvResult.getText().toString(); 
242             if(myStringDiv.equals(null)) 
243             { 
244                 return; 
245             } 
246             num1=Double.valueOf(myStringDiv); 
247             tvResult.setText(null); 
248             op=4; 
249             isClickEqu=false; 
250             break; 
251         case R.id.btnEqu: 
252             String myStringEqu=tvResult.getText().toString(); 
253             if(myStringEqu.equals(null)) 
254             { 
255                 return; 
256             } 
257             num2=Double.valueOf(myStringEqu); 
258             tvResult.setText(null); 
259             switch (op) { 
260             case 0: 
261                 Result=num2; 
262                 break; 
263             case 1: 
264                 Result=num1+num2; 
265                 break; 
266             case 2: 
267                 Result=num1-num2; 
268                 break; 
269             case 3: 
270                 Result=num1*num2; 
271                 break; 
272             case 4: 
273                 Result=num1/num2; 
274                 break; 
275             default: 
276                 Result=0; 
277                 break; 
278             } 
279             tvResult.setText(String.valueOf(Result)); 
280             isClickEqu=true; 
281             break; 
282 
 
283         default: 
284             break; 
285         } 
286     }  
287 } 
 


 
   

Status
 API
 Training
 Shop
 Blog
 About
 
