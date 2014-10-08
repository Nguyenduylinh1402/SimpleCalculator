package com.linhnguyen.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Activity {
	EditText edtResult;
	Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
			btnSeven, btnEight, btnNine, btnAdd, btnSub, btnMul, btnDiv,
			btnEqual, btnDel;
	String cal = "";
	int member = 0;
	int result = 0;
	boolean flag = false;
	boolean endflag = false;
	boolean equal = false;
	Editable editTable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		edtResult = (EditText) findViewById(R.id.edtResult);
		btnZero = (Button) findViewById(R.id.btnZero);
		btnOne = (Button) findViewById(R.id.btnOne);
		btnTwo = (Button) findViewById(R.id.btnTwo);
		btnThree = (Button) findViewById(R.id.btnThree);
		btnFour = (Button) findViewById(R.id.btnFour);
		btnFive = (Button) findViewById(R.id.btnFive);
		btnSix = (Button) findViewById(R.id.btnSix);
		btnSeven = (Button) findViewById(R.id.btnSeven);
		btnEight = (Button) findViewById(R.id.btnEight);
		btnNine = (Button) findViewById(R.id.btnNine);
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnSub = (Button) findViewById(R.id.btnSub);
		btnMul = (Button) findViewById(R.id.btnMul);
		btnDiv = (Button) findViewById(R.id.btnDiv);
		btnEqual = (Button) findViewById(R.id.btnEqual);
		btnDel = (Button) findViewById(R.id.btnDel);
		btnZero.setOnClickListener(myClick);
		btnOne.setOnClickListener(myClick);
		btnTwo.setOnClickListener(myClick);
		btnThree.setOnClickListener(myClick);
		btnFour.setOnClickListener(myClick);
		btnFive.setOnClickListener(myClick);
		btnSix.setOnClickListener(myClick);
		btnSeven.setOnClickListener(myClick);
		btnEight.setOnClickListener(myClick);
		btnNine.setOnClickListener(myClick);
		btnAdd.setOnClickListener(myClick);
		btnSub.setOnClickListener(myClick);
		btnMul.setOnClickListener(myClick);
		btnDiv.setOnClickListener(myClick);
		btnEqual.setOnClickListener(myClick);
		btnDel.setOnClickListener(myClick);

	}

	OnClickListener myClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			editTable = edtResult.getText();
			switch (v.getId()) {
			case R.id.btnZero:
				showInput(0);
				break;
			case R.id.btnOne:
				showInput(1);
				break;
			case R.id.btnTwo:
				showInput(2);
				break;
			case R.id.btnThree:
				showInput(3);
				break;
			case R.id.btnFour:
				showInput(4);
				break;
			case R.id.btnFive:
				showInput(5);
				break;
			case R.id.btnSix:
				showInput(6);
				break;
			case R.id.btnSeven:
				showInput(7);
				break;
			case R.id.btnEight:
				showInput(8);
				break;
			case R.id.btnNine:
				showInput(9);

				// // clear result sau khi phep toan thuc hien xong va thuc hien
				// // phep toan moi
				// if (equal == true) {
				// result = 0;
				// }
				// // sau khi thuc hien phep tinh, clear editable luu tren mang
				// // hinh de nhap so moi, khoi append
				// if (flag == false) {
				// editTable.clear();
				// }
				// // clear member cu
				// if (member != 0) {
				// member = 0;
				// edtResult.setText("");
				// }
				// editTable = editTable.append(btnNine.getText());
				// edtResult.setText(editTable);
				// flag = true;
				break;
			case R.id.btnAdd:
				cal = "+";
				operator(cal);
				flag = false;
				equal = false;
				break;
			case R.id.btnSub:
				cal = "-";
				operator(cal);
				flag = false;
				equal = false;
				break;
			case R.id.btnMul:
				cal = "*";
				operator(cal);
				flag = false;
				equal = false;
				break;
			case R.id.btnDiv:
				cal = "/";
				operator(cal);
				flag = false;
				equal = false;
				break;
			case R.id.btnEqual:
				equal = true;
				operatorEqual();
				break;
			case R.id.btnDel:
				backSpace();
				break;
			default:
				break;
			}
		}
	};

	public void showInput(int input) {
		if (equal == true) {
			result = 0;
		}
		if (flag == false) {
			editTable.clear();
		}
		if (member != 0) {
			member = 0;
			edtResult.setText("");
		}
		editTable = editTable.append(Integer.toString(input));
		edtResult.setText(editTable);
		flag = true;
	}

	public void operator(String op) {
		if (result == 0) {
			if (!edtResult.getText().toString().trim().equals("")) {
				result = Integer.parseInt(edtResult.getText().toString());
			}
		} else if (member != 0) {
			member = 0;
		} else if (flag == true) {
			member = Integer.parseInt(edtResult.getText().toString());
			if (op == "+") {
				result = result + member;
			} else if (op == "-") {
				result = result - member;
			} else if (op == "*") {
				result = result * member;
			} else if (op == "/") {
				result = result / member;
			}

			edtResult.setText(Integer.toString(result));
		}
	}

	public void operatorEqual() {
		if (!cal.equals("")) {// co phep toan nao duoc nhap
			if (member != 0) {// neu member != 0 thi da tinh toan trong
								// phep toan
				if (cal.equals("+") | cal.equals("-") | cal.equals("*")
						| cal.equals("/")) {
					edtResult.setText(Integer.toString(result));
				}
			} else {
				member = Integer.parseInt(edtResult.getText().toString());
				if (cal.equals("+")) {
					result = result + member;
				} else if (cal.equals("-")) {
					result = result - member;
				} else if (cal.equals("*")) {
					result = result * member;
				} else if (cal.equals("/")) {
					result = result / member;
				}

				edtResult.setText(Integer.toString(result));
			}
			flag = false;
		}
	}

	public void backSpace() {
		if (edtResult.length() > 0) {
			int temp = Integer.parseInt(edtResult.getText().toString());
			temp = temp / 10;
			if (temp == 0) {
				result = 0;
				member = 0;
				edtResult.setText("");
			} else {
				edtResult.setText(Integer.toString(temp));
			}
			if (result != 0) {
				result = temp;
			}
			flag = true;
			cal = "";
		}
	}

}
