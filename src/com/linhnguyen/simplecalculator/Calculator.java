package com.linhnguyen.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	EditText edtResult;
	Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
			btnSeven, btnEight, btnNine, btnAdd, btnSub, btnMul, btnDiv,
			btnEqual, btnDel;
	String cal = "";
	//String equal = "";
	int member = 0;
	int result = 0;
	boolean flag = false;
	boolean endflag = false;
	boolean equal = false;

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
			Editable editTable = edtResult.getText();
			switch (v.getId()) {
			case R.id.btnZero:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnZero.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnOne:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnOne.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnTwo:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnTwo.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnThree:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnThree.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnFour:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnFour.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnFive:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnFive.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnSix:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnSix.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnSeven:
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnSeven.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnEight:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnEight.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnNine:
				if(equal == true){
					result = 0;
				}
				if (flag == false) {
					editTable.clear();
				}
				if (member != 0) {
					member = 0;
					edtResult.setText("");
				}
				editTable = editTable.append(btnNine.getText());
				edtResult.setText(editTable);
				flag = true;
				break;
			case R.id.btnAdd:
				cal = "+";
				if (result == 0) {
					if (!edtResult.getText().toString().trim().equals("")) {
						result = Integer.parseInt(edtResult.getText()
								.toString());
					}
					// edtResult.setText("");
				} else if (member != 0) {
					member = 0;
					// edtResult.setText("");
				} else if (flag == true) {
					if (!edtResult.getText().toString().trim().equals("")) {
						member = Integer.parseInt(edtResult.getText()
								.toString());
					}

					// edtResult.setText("");
					result = result + member;
					edtResult.setText(Integer.toString(result));
				}
				flag = false;
				equal = false;
				// editTable = editTable.append(btnAdd.getText());
				// edtResult.setText(editTable);
				break;
			case R.id.btnSub:
				cal = "-";
				if (result == 0) {
					if (!edtResult.getText().toString().trim().equals("")) {
						result = Integer.parseInt(edtResult.getText()
								.toString());
					}
					// edtResult.setText("");
				} else if (member != 0) {
					member = 0;
					// edtResult.setText("");
				} else if (flag == true) {
					if (!edtResult.getText().toString().trim().equals("")) {
						member = Integer.parseInt(edtResult.getText()
								.toString());
					}

					// edtResult.setText("");
					result = result - member;
					edtResult.setText(Integer.toString(result));
				}
				flag = false;
				equal = false;
				// editTable = editTable.append(btnSub.getText());
				// edtResult.setText(editTable);
				break;
			case R.id.btnMul:
				cal = "*";
				if (result == 0) {
					if (!edtResult.getText().toString().trim().equals("")) {
						result = Integer.parseInt(edtResult.getText()
								.toString());
					}
					// edtResult.setText("");
				} else if (member != 0) {
					member = 0;
					// edtResult.setText("");
				} else if (flag == true) {
					if (!edtResult.getText().toString().trim().equals("")) {
						member = Integer.parseInt(edtResult.getText()
								.toString());
					}

					// edtResult.setText("");
					result = result * member;
					edtResult.setText(Integer.toString(result));
				}
				flag = false;
				equal = false;
				// editTable = editTable.append(btnMul.getText());
				// edtResult.setText(editTable);
				break;
			case R.id.btnDiv:
				cal = "/";
				if (result == 0) {
					if (!edtResult.getText().toString().trim().equals("")) {
						result = Integer.parseInt(edtResult.getText()
								.toString());
					}
					// edtResult.setText("");
				} else if (member != 0) {
					member = 0;
					// edtResult.setText("");
				} else if (flag == true) {
					if (!edtResult.getText().toString().trim().equals("")) {
						member = Integer.parseInt(edtResult.getText()
								.toString());
					}

					// edtResult.setText("");
					result = result / member;
					edtResult.setText(Integer.toString(result));
				}
				flag = false;
				equal = false;
				// editTable = editTable.append(btnDiv.getText());
				// edtResult.setText(editTable);
				break;
			case R.id.btnEqual:
				equal = true;
				if (!cal.equals("")) {
					if (member != 0) {
						if (cal.equals("+") | cal.equals("-") | cal.equals("*")
								| cal.equals("/")) {
							edtResult.setText(Integer.toString(result));
						}
					} else {
						if (cal.equals("+")) {
							member = Integer.parseInt(edtResult.getText()
									.toString());
							result = result + member;
							edtResult.setText(Integer.toString(result));
						}
						if (cal.equals("-")) {
							member = Integer.parseInt(edtResult.getText()
									.toString());
							result = result - member;
							edtResult.setText(Integer.toString(result));
						}
						if (cal.equals("*")) {
							member = Integer.parseInt(edtResult.getText()
									.toString());
							result = result * member;
							edtResult.setText(Integer.toString(result));
						}
						if (cal.equals("/")) {
							member = Integer.parseInt(edtResult.getText()
									.toString());
							result = result / member;
							edtResult.setText(Integer.toString(result));
						}
					}
					flag = false;
				}

				break;
			case R.id.btnDel:
				result = 0;
				member = 0;
				edtResult.setText("");
				break;
			default:
				break;
			}
		}
	};

	public void hideSoftKeyboard() {
		if (getCurrentFocus() != null) {
			InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
			inputMethodManager.hideSoftInputFromWindow(getCurrentFocus()
					.getWindowToken(), 0);
		}
	}

}
