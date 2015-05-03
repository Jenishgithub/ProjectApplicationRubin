package com.canvas.picafect2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Special_Effect extends Activity {

	Button bt, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12,
			bt13, bt14;

	Bitmap bmp, bm;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Typeface myTypeface = Typeface.createFromAsset(getAssets(),
				"font/HALOHANDLETTER.OTF");
		TextView myTextView = (TextView) findViewById(R.id.txtTitle);
		myTextView.setTypeface(myTypeface);

		setContentView(R.layout.effect_special);

		bmp = ImageFilter.getBitmap();
		image = (ImageView) findViewById(R.id.specialEffectImageView);

		image.setImageBitmap(bmp);

		//initialize();
		//clickListener();

	}

	/*public void initialize() {
		bt = (Button) findViewById(R.id.original);
		bt1 = (Button) findViewById(R.id.button_change_to_gray);
		bt2 = (Button) findViewById(R.id.button_change_to_block);
		bt3 = (Button) findViewById(R.id.button_change_to_old);
		bt4 = (Button) findViewById(R.id.button_change_to_ice);
		bt5 = (Button) findViewById(R.id.button_change_to_carton);
		bt6 = (Button) findViewById(R.id.button_change_to_molten);
		bt7 = (Button) findViewById(R.id.button_change_to_soft);
		bt8 = (Button) findViewById(R.id.button_change_to_eclosion);
		bt9 = (Button) findViewById(R.id.button_change_to_relief);
		bt10 = (Button) findViewById(R.id.button_change_to_oid);
		bt11 = (Button) findViewById(R.id.button_change_to_invert);
		bt12 = (Button) findViewById(R.id.button_change_to_light);
		bt13 = (Button) findViewById(R.id.button_change_to_lomo);
		bt14 = (Button) findViewById(R.id.button_change_to_haha);

	}

	public void clickListener() {
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
		bt.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.button_change_to_gray:
			image.setImageBitmap(FilterApi.changeToGray(bmp));
			break;
		case R.id.button_change_to_block:
			image.setImageBitmap(FilterApi.changeToBlock(bmp));
			break;
		case R.id.button_change_to_old:
			image.setImageBitmap(FilterApi.changeToOld(bmp));
			break;
		case R.id.button_change_to_ice:
			image.setImageBitmap(FilterApi.changeToIce(bmp));
			break;
		case R.id.button_change_to_carton:
			image.setImageBitmap(FilterApi.changeToCarton(bmp));
			break;
		case R.id.button_change_to_molten:
			image.setImageBitmap(FilterApi.changeToMolten(bmp));
			break;
		case R.id.button_change_to_soft:
			image.setImageBitmap(FilterApi.changeToSoftness(bmp));
			break;
		case R.id.button_change_to_eclosion:
			image.setImageBitmap(FilterApi.changeToEclosion(bmp));
			break;
		case R.id.button_change_to_relief:
			image.setImageBitmap(FilterApi.changeToRelief(bmp));
			break;
		case R.id.button_change_to_oid:
			image.setImageBitmap(FilterApi.changeToOil(bmp));
			break;
		case R.id.button_change_to_invert:
			image.setImageBitmap(FilterApi.chageToInvert(bmp));
			break;
		case R.id.button_change_to_light:
			image.setImageBitmap(FilterApi.changeToLight(bmp));
			break;
		case R.id.button_change_to_lomo:
			image.setImageBitmap(FilterApi.changeToLomo(bmp));
			break;
		case R.id.button_change_to_haha:
			image.setImageBitmap(FilterApi.changeToHaha(bmp));
			break;
		default:
			image.setImageBitmap(bmp);
			break;
		}

	}*/

}
