package sg.edu.rp.c346.morningexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContactList;

    ArrayList<ContactList> alContact;
    CustomAdapter caContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContactList = findViewById(R.id.listViewContactList);

        alContact = new ArrayList<>();
        ContactList c1 = new ContactList("Mary","+65",65442334);
        ContactList c2 = new ContactList("Ken","+65",97442437);

        alContact.add(c1);
        alContact.add(c2);

        caContact = new CustomAdapter(this,R.layout.contact_item,alContact);
        lvContactList.setAdapter(caContact);
    }
}
