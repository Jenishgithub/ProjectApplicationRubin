package com.canvas.picafect2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Effect_Choose extends Activity implements OnClickListener {

	ImageView image;
	Bitmap bitmap, bm;
	Button effects, specialEffects, comboEffects;
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.effect_choose);

		Typeface myTypeface = Typeface.createFromAsset(getAssets(),
				"font/HALOHANDLETTER.OTF");
		TextView myTextView = (TextView) findViewById(R.id.txtTitle);
		myTextView.setTypeface(myTypeface);

		/*
		 * Bundle extras = getIntent().getExtras(); byte[] byteArray =
		 * extras.getByteArray("picture");
		 * 
		 * bitmap = BitmapFactory.decodeByteArray(byteArray, 0,
		 * byteArray.length);
		 */
		image = (ImageView) findViewById(R.id.mImageView);

		image.setImageBitmap(ImageFilter.getBitmap());

		initialize();
		clickListener();

	}

	public void clickListener() {
		effects.setOnClickListener(this);
		specialEffects.setOnClickListener(this);
		comboEffects.setOnClickListener(this);
	}

	private void initialize() {
		effects = (Button) findViewById(R.id.enhance);
		specialEffects = (Button) findViewById(R.id.effects);
		comboEffects = (Button) findViewById(R.id.smart);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.enhance:
			/*
			 * BitmapDrawable abmp = (BitmapDrawable) image.getDrawable(); bm =
			 * abmp.getBitmap(); ByteArrayOutputStream stream = new
			 * ByteArrayOutputStream(); bm.compress(Bitmap.CompressFormat.PNG,
			 * 100, stream); byte[] byteArray = stream.toByteArray();
			 */
			
					intent = new Intent(this, Effect.class);
					// intent.putExtra("picture", byteArray);
					startActivity(intent);
			break;
		case R.id.effects:
			Intent i = new Intent(this, Hello.class);
			startActivity(i);
			
			break;

		case R.id.smart:
			/*
			 * BitmapDrawable abmp1 = (BitmapDrawable) image.getDrawable(); bm =
			 * abmp1.getBitmap(); ByteArrayOutputStream stream1 = new
			 * ByteArrayOutputStream(); bm.compress(Bitmap.CompressFormat.PNG,
			 * 100, stream1); byte[] byteArray1 = stream1.toByteArray();
			 */
					intent = new Intent(this, Effects_Combo.class);
					// comboIntent.putExtra("picture", byteArray1);
					startActivity(intent);
			break;
		}
	}

}