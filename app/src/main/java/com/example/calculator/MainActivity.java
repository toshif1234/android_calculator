package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Scanner;
import java.util.Stack;
import android.widget.Toast;
public class MainActivity extends
        AppCompatActivity {
    EditText editText;
    Button
            bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bdiv,bmul
            ,bsub,badd,bback,bdot,bclear,bequal,bmod;
    float a,b;
    Boolean add,sub,mul,div,mod;
    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=false;
        sub=false;
        mul=false;
        div=false;
        mod=false;
        editText=(EditText)findViewById(R.id.text);
        bt0=(Button)findViewById(R.id.b0);
        bt1=(Button)findViewById(R.id.b1);
        bt2=(Button)findViewById(R.id.b2);
        bt3=(Button)findViewById(R.id.b3);
        bt4=(Button)findViewById(R.id.b4);
        bt5=(Button)findViewById(R.id.b5);
        bt6=(Button)findViewById(R.id.b6);
        bt7=(Button)findViewById(R.id.b7);
        bt8=(Button)findViewById(R.id.b8);
        bt9=(Button)findViewById(R.id.b9);
        bdiv=(Button)findViewById(R.id.div);
        bmul=(Button)findViewById(R.id.mul);
        bsub=(Button)findViewById(R.id.sub);
        badd=(Button)findViewById(R.id.add);
        bclear=(Button)findViewById(R.id.clear);
        bequal=(Button)findViewById(R.id.equal);
        bmod=(Button)findViewById(R.id.rem);
        bdot=(Button)findViewById(R.id.dot);
        bback=(Button)findViewById(R.id.back);
        bt0.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"0");
                                           }
                                       });
        bt1.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"1");
                                           }
                                       });
        bt2.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"2");
                                           }
                                       });
        bt3.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"3");
                                           }
                                       });
        bt4.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"4");
                                           }
                                       });
        bt5.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"5");
                                           }
                                       });
        bt6.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"6");
                                           }
                                       });
        bt7.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"7");
                                           }
                                       });
        bt8.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"8");
                                           }
                                       });
        bt9.setOnClickListener(new
                                       View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               editText.setText(editText.getText()+"9");
                                           }
                                       });
        bdot.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                editText.setText(editText.getText()+".");
                                            }
                                        });
        badd.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if(editText==null)
                                                {
                                                    editText.setText("");
                                                }
                                                else
                                                {

                                                    a=Float.parseFloat(editText.getText()+"");
                                                    add=true;
                                                    editText.setText("");
                                                }
                                            }
                                        });
        bsub.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                a=Float.parseFloat(editText.getText()+"");
                                                sub=true;
                                                editText.setText(null);
                                            }
                                        });
        bmul.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                a=Float.parseFloat(editText.getText()+"");
                                                mul=true;
                                                editText.setText(null);
                                            }
                                        });
        bdiv.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                a=Float.parseFloat(editText.getText()+"");
                                                div=true;
                                                editText.setText(null);
                                            }
                                        });
        bmod.setOnClickListener(new
                                        View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                a=Float.parseFloat(editText.getText()+"");
                                                mod=true;
                                                editText.setText(null);
                                            }
                                        });
        bequal.setOnClickListener(new
                                          View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {

                                                  b=Float.parseFloat(editText.getText()+"");

//                                                  if(a>b){
//                                                      editText.setText(a+b +"");
//                                                  }
//                                                  else{
//                                                      editText.setText(a-b +"");
//                                                  }
                                                  if (add) {
                                                      editText.setText(a+b +"");
                                                      add = false;
                                                  }
                                                  if(sub) {
                                                      editText.setText(a - b + "");
                                                      sub = false;
                                                  }
                                                  if(div) {
                                                      editText.setText(a / b + "");
                                                      div= false;
                                                  }
                                                  if(mul) {
                                                      editText.setText(a *b + "");
                                                      mul = false;
                                                  }
                                                  if(mod) {
                                                      editText.setText(a %b + "");
                                                      mod = false;
                                                  }
                                              }
                                          });
        bclear.setOnClickListener(new
                                          View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  editText.setText(null);
                                              }
                                          });
        bback.setOnClickListener(new
                                         View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 String
                                                         a=editText.getText().toString();
                                                 if(a.length()>0)
                                                 {
                                                     String
                                                             b=a.substring(0,a.length()-1);
                                                     editText.setText(b);
                                                 }
                                             }
                                         });
    }
}
