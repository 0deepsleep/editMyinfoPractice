package dasdsa.sdn.editmyinfopractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }


    override fun setupEvents() {
        okBtn.setOnLongClickListener {
            //스피너에 선택된 문구를 로그 찍기
            val selectedJob = jobSpinner.selectedItem as String
            Log.d ("선택된 직업", selectedJob)


            val selectedPosition = jobSpinner.selectedItemPosition
            Log.d("선택된 위치", "${selectedPosition}번째 아이템")
        }

    }

    override fun setValues() {

    }


}
