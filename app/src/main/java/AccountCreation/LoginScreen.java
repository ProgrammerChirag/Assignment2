package AccountCreation;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.selflearn.assignment.R;

public class LoginScreen extends AppCompatActivity {

    TextView business;
    ConstraintLayout areYouABusinessBtn;
    EditText phone;
    Button submit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        business = findViewById(R.id.t2);
        SpannableString content = new SpannableString(String.valueOf(R.string.bussiness));
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        business.setText(content);

        areYouABusinessBtn = findViewById(R.id.businessSignUpBtn);
        phone = findViewById(R.id.phoneNumber);
        submit = findViewById(R.id.sendOTPBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = phone.getText().toString();
                if (number.length() < 10)
                {
                    phone.setError("Please enter phone number");
                }else {

                    // pass the phone number to the next Activity.
                    Intent intent = new Intent();

                }
            }
        });

        areYouABusinessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
