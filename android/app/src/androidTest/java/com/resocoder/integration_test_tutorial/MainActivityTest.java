// Change this line to YOUR package name:
package com.resocoder.integration_test_tutorial;
import io.flutter.embedding.android.FlutterActivity;
import androidx.test.rule.ActivityTestRule;
import dev.flutter.plugins.integration_test.FlutterTestRunner;
import org.junit.Rule;
import org.junit.runner.RunWith;
// Import MainActivity from YOUR package
import com.resocoder.integration_test_tutorial.MainActivity;

public class MainActivity extends FlutterActivity { }

@RunWith(FlutterTestRunner.class)
public class MainActivityTest {
  @Rule
  public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class, true, false);
}
