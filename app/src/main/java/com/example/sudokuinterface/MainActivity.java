package com.example.sudokuinterface;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText et1 = (EditText) findViewById(R.id.inputone);
        EditText et2 = (EditText) findViewById(R.id.inputtwo);
        EditText et3 = (EditText) findViewById(R.id.inputthree);
        EditText et4 = (EditText) findViewById(R.id.inputfour);
        EditText et5 = (EditText) findViewById(R.id.inputfive);
        EditText et6 = (EditText) findViewById(R.id.inputsix);
        EditText et7 = (EditText) findViewById(R.id.inputseven);
        EditText et8 = (EditText) findViewById(R.id.inputeight);
        EditText et9 = (EditText) findViewById(R.id.inputnine);
        EditText et10 = (EditText) findViewById(R.id.input10);
        EditText et11 = (EditText) findViewById(R.id.input11);
        EditText et12 = (EditText) findViewById(R.id.input12);
        EditText et13 = (EditText) findViewById(R.id.input13);
        EditText et14 = (EditText) findViewById(R.id.input14);
        EditText et15 = (EditText) findViewById(R.id.input15);
        EditText et16 = (EditText) findViewById(R.id.input16);
        EditText et17 = (EditText) findViewById(R.id.input17);
        EditText et18 = (EditText) findViewById(R.id.input18);
        EditText et19 = (EditText) findViewById(R.id.input19);
        EditText et20 = (EditText) findViewById(R.id.input20);
        EditText et21 = (EditText) findViewById(R.id.input21);
        EditText et22 = (EditText) findViewById(R.id.input22);
        EditText et23 = (EditText) findViewById(R.id.input23);
        EditText et24 = (EditText) findViewById(R.id.input24);
        EditText et25 = (EditText) findViewById(R.id.input25);
        EditText et26 = (EditText) findViewById(R.id.input26);
        EditText et27 = (EditText) findViewById(R.id.input27);
        EditText et28 = (EditText) findViewById(R.id.input28);
        EditText et29 = (EditText) findViewById(R.id.input29);
        EditText et30 = (EditText) findViewById(R.id.input30);
        EditText et31 = (EditText) findViewById(R.id.input31);
        EditText et32 = (EditText) findViewById(R.id.input32);
        EditText et33 = (EditText) findViewById(R.id.input33);
        EditText et34 = (EditText) findViewById(R.id.input34);
        EditText et35 = (EditText) findViewById(R.id.input35);
        EditText et36 = (EditText) findViewById(R.id.input36);
        EditText et37 = (EditText) findViewById(R.id.input37);
        EditText et38 = (EditText) findViewById(R.id.input38);
        EditText et39 = (EditText) findViewById(R.id.input39);
        EditText et40 = (EditText) findViewById(R.id.input40);
        EditText et41 = (EditText) findViewById(R.id.input41);
        EditText et42 = (EditText) findViewById(R.id.input42);
        EditText et43 = (EditText) findViewById(R.id.input43);
        EditText et44 = (EditText) findViewById(R.id.input44);
        EditText et45 = (EditText) findViewById(R.id.input45);
        EditText et46 = (EditText) findViewById(R.id.input46);
        EditText et47 = (EditText) findViewById(R.id.input47);
        EditText et48 = (EditText) findViewById(R.id.input48);
        EditText et49 = (EditText) findViewById(R.id.input49);
        EditText et50 = (EditText) findViewById(R.id.input50);
        EditText et51 = (EditText) findViewById(R.id.input51);
        EditText et52 = (EditText) findViewById(R.id.input52);
        EditText et53 = (EditText) findViewById(R.id.input53);
        EditText et54 = (EditText) findViewById(R.id.input54);
        EditText et55 = (EditText) findViewById(R.id.input55);
        EditText et56 = (EditText) findViewById(R.id.input56);
        EditText et57 = (EditText) findViewById(R.id.input57);
        EditText et58 = (EditText) findViewById(R.id.input58);
        EditText et59 = (EditText) findViewById(R.id.input59);
        EditText et60 = (EditText) findViewById(R.id.input60);
        EditText et61 = (EditText) findViewById(R.id.input61);
        EditText et62 = (EditText) findViewById(R.id.input62);
        EditText et63 = (EditText) findViewById(R.id.input63);
        EditText et64 = (EditText) findViewById(R.id.input64);
        EditText et65 = (EditText) findViewById(R.id.input65);
        EditText et66 = (EditText) findViewById(R.id.input66);
        EditText et67 = (EditText) findViewById(R.id.input67);
        EditText et68 = (EditText) findViewById(R.id.input68);
        EditText et69 = (EditText) findViewById(R.id.input69);
        EditText et70 = (EditText) findViewById(R.id.input70);
        EditText et71 = (EditText) findViewById(R.id.input71);
        EditText et72 = (EditText) findViewById(R.id.input72);
        EditText et73 = (EditText) findViewById(R.id.input73);
        EditText et74 = (EditText) findViewById(R.id.input74);
        EditText et75 = (EditText) findViewById(R.id.input75);
        EditText et76 = (EditText) findViewById(R.id.input76);
        EditText et77 = (EditText) findViewById(R.id.input77);
        EditText et78 = (EditText) findViewById(R.id.input78);
        EditText et79 = (EditText) findViewById(R.id.input79);
        EditText et80 = (EditText) findViewById(R.id.input80);
        EditText et81 = (EditText) findViewById(R.id.input81);

        EditText[][] matrix = { {et1, et2, et3, et10, et11, et12, et19, et20, et21 },
                { et4, et5, et6, et13, et14, et15, et22, et23, et24 },
                { et7, et8, et9, et16, et17, et18, et25, et26, et27 },
                { et28, et29, et30, et37, et38, et39, et46, et47, et48 },
                { et31, et32, et33, et40, et41, et42, et49, et50, et51 },
                { et34, et35, et36, et43, et44, et45, et52, et53, et54 },
                { et55, et56, et57, et64, et65, et66, et73, et74, et75 },
                { et58, et59, et60, et67, et68, et69, et76, et77, et78 },
                { et61, et62, et63, et70, et71, et72, et79, et80, et81 } };


        int value1 =  et1.getText().toString().matches("") ? 0 : Integer.parseInt(et1.getText().toString());
        int value2 =  et2.getText().toString().matches("") ? 0 : Integer.parseInt(et2.getText().toString());
        int value3 =  et3.getText().toString().matches("") ? 0 : Integer.parseInt(et3.getText().toString());
        int value4 =  et4.getText().toString().matches("") ? 0 : Integer.parseInt(et4.getText().toString());
        int value5 =  et5.getText().toString().matches("") ? 0 : Integer.parseInt(et5.getText().toString());
        int value6 =  et6.getText().toString().matches("") ? 0 : Integer.parseInt(et6.getText().toString());
        int value7 =  et7.getText().toString().matches("") ? 0 : Integer.parseInt(et7.getText().toString());
        int value8 =  et8.getText().toString().matches("") ? 0 : Integer.parseInt(et8.getText().toString());
        int value9 =  et9.getText().toString().matches("") ? 0 : Integer.parseInt(et9.getText().toString());
        int value10 = et10.getText().toString().matches("") ? 0 : Integer.parseInt(et10.getText().toString());
        int value11 = et11.getText().toString().matches("") ? 0 : Integer.parseInt(et11.getText().toString());
        int value12 = et12.getText().toString().matches("") ? 0 : Integer.parseInt(et12.getText().toString());
        int value13 = et13.getText().toString().matches("") ? 0 : Integer.parseInt(et13.getText().toString());
        int value14 = et14.getText().toString().matches("") ? 0 : Integer.parseInt(et14.getText().toString());
        int value15 = et15.getText().toString().matches("") ? 0 : Integer.parseInt(et15.getText().toString());
        int value16 = et16.getText().toString().matches("") ? 0 : Integer.parseInt(et16.getText().toString());
        int value17 = et17.getText().toString().matches("") ? 0 : Integer.parseInt(et17.getText().toString());
        int value18 = et18.getText().toString().matches("") ? 0 : Integer.parseInt(et18.getText().toString());
        int value19 = et19.getText().toString().matches("") ? 0 : Integer.parseInt(et19.getText().toString());
        int value20 = et20.getText().toString().matches("") ? 0 : Integer.parseInt(et20.getText().toString());
        int value21 = et21.getText().toString().matches("") ? 0 : Integer.parseInt(et21.getText().toString());
        int value22 = et22.getText().toString().matches("") ? 0 : Integer.parseInt(et22.getText().toString());
        int value23 = et23.getText().toString().matches("") ? 0 : Integer.parseInt(et23.getText().toString());
        int value24 = et24.getText().toString().matches("") ? 0 : Integer.parseInt(et24.getText().toString());
        int value25 = et25.getText().toString().matches("") ? 0 : Integer.parseInt(et25.getText().toString());
        int value26 = et26.getText().toString().matches("") ? 0 : Integer.parseInt(et26.getText().toString());
        int value27 = et27.getText().toString().matches("") ? 0 : Integer.parseInt(et27.getText().toString());
        int value28 = et28.getText().toString().matches("") ? 0 : Integer.parseInt(et28.getText().toString());
        int value29 = et29.getText().toString().matches("") ? 0 : Integer.parseInt(et29.getText().toString());
        int value30 = et30.getText().toString().matches("") ? 0 : Integer.parseInt(et30.getText().toString());
        int value31 = et31.getText().toString().matches("") ? 0 : Integer.parseInt(et31.getText().toString());
        int value33 = et33.getText().toString().matches("") ? 0 : Integer.parseInt(et33.getText().toString());
        int value32 = et32.getText().toString().matches("") ? 0 : Integer.parseInt(et32.getText().toString());
        int value34 = et34.getText().toString().matches("") ? 0 : Integer.parseInt(et34.getText().toString());
        int value35 = et35.getText().toString().matches("") ? 0 : Integer.parseInt(et35.getText().toString());
        int value36 = et36.getText().toString().matches("") ? 0 : Integer.parseInt(et36.getText().toString());
        int value37 = et37.getText().toString().matches("") ? 0 : Integer.parseInt(et37.getText().toString());
        int value38 = et38.getText().toString().matches("") ? 0 : Integer.parseInt(et38.getText().toString());
        int value39 = et39.getText().toString().matches("") ? 0 : Integer.parseInt(et39.getText().toString());
        int value40 = et40.getText().toString().matches("") ? 0 : Integer.parseInt(et40.getText().toString());
        int value41 = et41.getText().toString().matches("") ? 0 : Integer.parseInt(et41.getText().toString());
        int value42 = et42.getText().toString().matches("") ? 0 : Integer.parseInt(et42.getText().toString());
        int value43 = et43.getText().toString().matches("") ? 0 : Integer.parseInt(et43.getText().toString());
        int value44 = et44.getText().toString().matches("") ? 0 : Integer.parseInt(et44.getText().toString());
        int value45 = et45.getText().toString().matches("") ? 0 : Integer.parseInt(et45.getText().toString());
        int value46 = et46.getText().toString().matches("") ? 0 : Integer.parseInt(et46.getText().toString());
        int value47 = et47.getText().toString().matches("") ? 0 : Integer.parseInt(et47.getText().toString());
        int value48 = et48.getText().toString().matches("") ? 0 : Integer.parseInt(et48.getText().toString());
        int value49 = et49.getText().toString().matches("") ? 0 : Integer.parseInt(et49.getText().toString());
        int value50 = et50.getText().toString().matches("") ? 0 : Integer.parseInt(et50.getText().toString());
        int value51 = et51.getText().toString().matches("") ? 0 : Integer.parseInt(et51.getText().toString());
        int value52 = et52.getText().toString().matches("") ? 0 : Integer.parseInt(et52.getText().toString());
        int value53 = et53.getText().toString().matches("") ? 0 : Integer.parseInt(et53.getText().toString());
        int value54 = et54.getText().toString().matches("") ? 0 : Integer.parseInt(et54.getText().toString());
        int value55 = et55.getText().toString().matches("") ? 0 : Integer.parseInt(et55.getText().toString());
        int value56 = et56.getText().toString().matches("") ? 0 : Integer.parseInt(et56.getText().toString());
        int value57 = et57.getText().toString().matches("") ? 0 : Integer.parseInt(et57.getText().toString());
        int value58 = et58.getText().toString().matches("") ? 0 : Integer.parseInt(et58.getText().toString());
        int value59 = et59.getText().toString().matches("") ? 0 : Integer.parseInt(et59.getText().toString());
        int value60 = et60.getText().toString().matches("") ? 0 : Integer.parseInt(et60.getText().toString());
        int value61 = et61.getText().toString().matches("") ? 0 : Integer.parseInt(et61.getText().toString());
        int value62 = et62.getText().toString().matches("") ? 0 : Integer.parseInt(et62.getText().toString());
        int value63 = et63.getText().toString().matches("") ? 0 : Integer.parseInt(et63.getText().toString());
        int value64 = et64.getText().toString().matches("") ? 0 : Integer.parseInt(et64.getText().toString());
        int value65 = et65.getText().toString().matches("") ? 0 : Integer.parseInt(et65.getText().toString());
        int value66 = et66.getText().toString().matches("") ? 0 : Integer.parseInt(et66.getText().toString());
        int value67 = et67.getText().toString().matches("") ? 0 : Integer.parseInt(et67.getText().toString());
        int value68 = et68.getText().toString().matches("") ? 0 : Integer.parseInt(et68.getText().toString());
        int value69 = et69.getText().toString().matches("") ? 0 : Integer.parseInt(et69.getText().toString());
        int value70 = et70.getText().toString().matches("") ? 0 : Integer.parseInt(et70.getText().toString());
        int value71 = et71.getText().toString().matches("") ? 0 : Integer.parseInt(et71.getText().toString());
        int value72 = et72.getText().toString().matches("") ? 0 : Integer.parseInt(et72.getText().toString());
        int value73 = et73.getText().toString().matches("") ? 0 : Integer.parseInt(et73.getText().toString());
        int value74 = et74.getText().toString().matches("") ? 0 : Integer.parseInt(et74.getText().toString());
        int value75 = et75.getText().toString().matches("") ? 0 : Integer.parseInt(et75.getText().toString());
        int value76 = et76.getText().toString().matches("") ? 0 : Integer.parseInt(et76.getText().toString());
        int value77 = et77.getText().toString().matches("") ? 0 : Integer.parseInt(et77.getText().toString());
        int value78 = et78.getText().toString().matches("") ? 0 : Integer.parseInt(et78.getText().toString());
        int value79 = et79.getText().toString().matches("") ? 0 : Integer.parseInt(et79.getText().toString());
        int value80 = et80.getText().toString().matches("") ? 0 : Integer.parseInt(et80.getText().toString());
        int value81 = et81.getText().toString().matches("") ? 0 : Integer.parseInt(et81.getText().toString());


        int[][] board = { {value1, value2, value3, value10, value11, value12, value19, value20, value21 },
                { value4, value5, value6, value13, value14, value15, value22, value23, value24 },
                { value7, value8, value9, value16, value17, value18, value25, value26, value27 },
                { value28, value29, value30, value37, value38, value39, value46, value47, value48 },
                { value31, value32, value33, value40, value41, value42, value49, value50, value51 },
                { value34, value35, value36, value43, value44, value45, value52, value53, value54 },
                { value55, value56, value57, value64, value65, value66, value73, value74, value75 },
                { value58, value59, value60, value67, value68, value69, value76, value77, value78 },
                { value61, value62, value63, value70, value71, value72, value79, value80, value81 } };




        Button clear = (Button) findViewById(R.id.newGame);










        int [][] m = SudokuGenerator.generate();


        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++) {
                if (m[i][j] != 0) {
                    board[i][j] = m[i][j];
                } else {
                    continue;
                }
            }
        }

        for(int l=0;l<9;l++){
            for(int k = 0;k<9;k++){
                if(board[l][k] != 0){
                    matrix[l][k].setText(String.valueOf(board[l][k]));
                } else {
                    continue;
                }

            }
        }




















        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
            }
        });


        Button check = findViewById(R.id.checkButton);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int l=0;l<9;l++){
                    for(int k = 0;k<9;k++){
                            board[l][k] = matrix[l][k].getText().toString().matches("") ? 0 : Integer.parseInt(matrix[l][k].getText().toString());
                    }
                }





                for(int i = 0;i<9;i++){
                    for(int j = 0;j<9;j++){
                        System.out.println(board[i][j]);
                    }
                }

                if (isValidSudoku(board)) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("You Win!");
                    alert.setMessage("Would You Like To Start A New Game?");


                    alert.setPositiveButton(android.R.string.yes, (dialog, which) -> {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    });

                    alert.setNegativeButton(android.R.string.no, null);
                    alert.setIcon(android.R.drawable.ic_dialog_alert).show();


                } else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Wrong or Empty Sudoku!");
                    alert.setMessage("Would You Like To Start A New Game?");


                    alert.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);

                        }
                    });

                    alert.setNegativeButton(android.R.string.no, null);
                    alert.setIcon(android.R.drawable.ic_dialog_alert).show();
                }

            }
        });

        et1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et1.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et2.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et3.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et3.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et4.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et4.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et5.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et5.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et6.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et6.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et7.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et7.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et8.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et8.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et9.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et9.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et10.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et10.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et11.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et11.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et12.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et12.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et13.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et13.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et14.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et14.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et15.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et15.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et16.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et16.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et17.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et17.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et18.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et18.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et19.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et19.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et20.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et20.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et21.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et21.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et22.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et22.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et23.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et23.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et24.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et24.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et25.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et25.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et26.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et26.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et27.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et27.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et28.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et28.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et29.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et29.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et30.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et30.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et31.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et31.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et32.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et32.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et33.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et33.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et34.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et34.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et35.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et35.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et36.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et36.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et37.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et37.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et38.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et38.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et39.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et39.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et40.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et40.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et41.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et41.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et42.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et42.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et43.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et43.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et44.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et44.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et45.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et45.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et46.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et46.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        et47.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et47.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et48.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et48.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et49.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et49.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et50.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et50.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et51.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et51.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et52.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et52.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et53.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et53.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et54.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et54.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et55.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et55.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et56.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et56.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et57.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et57.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et58.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et58.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et59.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et59.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et60.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et60.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et61.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et61.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et62.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et62.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et63.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et63.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et64.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et64.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et65.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et65.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et66.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et66.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et67.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et67.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et68.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et68.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et69.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et69.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et70.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et70.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et71.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et71.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et72.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et72.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et73.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et73.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et74.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et74.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et75.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et75.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et76.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et76.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et77.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et77.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et78.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et78.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et79.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et79.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et80.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et80.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        et81.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        et81.setTransformationMethod(new NumericKeyBoardTransformationMethod());




    }


    private class NumericKeyBoardTransformationMethod extends PasswordTransformationMethod {
        @Override
        public CharSequence getTransformation(CharSequence source, View view) {
            return source;
        }
    }

    public boolean isValidSudoku(int board[][])
    {




        if (isinRange(board) == false)
        {
            return false;
        }


        boolean[] unique = new boolean[N + 1];


        for(int i = 0; i < N; i++)
        {
            Arrays.fill(unique, false);
            for(int j = 0; j < N; j++)
            {
                int Z = board[i][j];
                if (unique[Z])
                {
                    return false;
                }
                unique[Z] = true;
            }
        }
        for(int i = 0; i < N; i++)
        {
            Arrays.fill(unique, false);
            for(int j = 0; j < N; j++)
            {
                int Z = board[j][i];
                if (unique[Z])
                {
                    return false;
                }
                unique[Z] = true;
            }
        }
        for(int i = 0; i < N - 2; i += 3)
        {
            for(int j = 0; j < N - 2; j += 3)
            {
                Arrays.fill(unique, false);
                for(int k = 0; k < 3; k++)
                {
                    for(int l = 0; l < 3; l++)
                    {
                        int X = i + k;
                        int Y = j + l;
                        int Z = board[X][Y];
                        if (unique[Z])
                        {
                            return false;
                        }
                        unique[Z] = true;
                    }
                }
            }
        }
        return true;
    }

    static int N = 9;

    static boolean isinRange(int[][] board)
    {


        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {


                if (board[i][j] <= 0 ||
                        board[i][j] > 9)
                {
                    return false;
                }
            }
        }


        return true;
    }







}

