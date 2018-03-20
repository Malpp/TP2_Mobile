package ca.csf.mobile1.tp2.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

import ca.csf.mobile1.tp2.R;
import ca.csf.mobile1.utils.view.CharactersFilter;

public class MainActivity extends Tp2Activity
{
	
	private static final int KEY_LENGTH = 5;
	private static final int MAX_KEY_VALUE = (int) Math.pow(10, KEY_LENGTH) - 1;
	
	private View rootView;
	private EditText inputEditText;
	private TextView outputTextView;
	private TextView currentKeyTextView;
	private ProgressBar progressBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		createView();
	}
	
	private void createView()
	{
		setContentView(R.layout.activity_main);
		
		rootView = findViewById(R.id.rootView);
		progressBar = findViewById(R.id.progressbar);
		inputEditText = findViewById(R.id.input_edittext);
		inputEditText.setFilters(new InputFilter[]{new CharactersFilter()});
		outputTextView = findViewById(R.id.output_textview);
		currentKeyTextView = findViewById(R.id.current_key_textview);
	}
	
	@SuppressWarnings("ConstantConditions")
	private void putTextInClipboard(String text)
	{
		ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
		clipboard.setPrimaryClip(ClipData.newPlainText(getResources().getString(R.string.clipboard_encrypted_text),
		                                               text));
	}
	
}
