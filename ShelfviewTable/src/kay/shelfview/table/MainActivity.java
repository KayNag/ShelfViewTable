package kay.shelfview.table;



import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		int numRow = 8;
		int numCol = 15;

		TableLayout tblLayout = (TableLayout) findViewById(R.id.tblLayout);

		for(int i = 0; i < numRow; i++) {
			HorizontalScrollView HSV = new HorizontalScrollView(this);
			HSV.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.MATCH_PARENT));

			TableRow tblRow = new TableRow(this);
			tblRow.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 
					LayoutParams.WRAP_CONTENT));
			
			tblRow.setBackgroundResource(R.drawable.bookshelf);
			

			for(int j = 0; j < numCol; j++) {
				
				ImageView imageView = new ImageView(this);
				imageView.setImageResource(R.drawable.book);
				 TextView textView = new TextView(this);
	                textView.setText("Java Tester");
	                textView.setGravity(Gravity.TOP);
	                textView.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
	                
				tblRow.addView(imageView,j);
				tblRow.addView(textView,j);
				
				
			}

			HSV.addView(tblRow);
			tblLayout.addView(HSV, i);
		}
	}

}
