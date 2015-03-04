package mybuttons.javaprograms.com.mybuttons;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    //Here we created a myButton reference
    //alt enter to import the button package
    private Button myButton;
    private TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We are fetching the button by id, so we can reference the button in our code
        //We are instantiating our button
        //This is how we access our xml file
        //we are casting it so it knows we are talking about a button
        myButton = (Button) findViewById(R.id.buttonId);
        myTextView = (TextView) findViewById(R.id.textViewId);
        //Now we want to set an event listener to this button
        //So that when we click on it something happens

        myButton.setOnClickListener(new View.OnClickListener() {
            //onclick function has been overridden
            @Override
            public void onClick(View v) {

                myTextView.setText("Hello there!");
                Toast.makeText(getApplicationContext(), "I was clicked!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
