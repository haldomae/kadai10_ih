package com.hal_domae.kadai10_ih

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LifeCycle", "ResultActivityのonCreateが実行")
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Activityがユーザに見える状態になった時に実行される
    // 操作可能になるまでの間実行される
    // 遷移で元に戻った時にも実行される
    // 位置情報の更新、カメラ、音声の準備
    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "ResultActivityのonStartが実行")
    }

    // Activityが前面に表示され、ユーザとのやり取りが可能になる直前に実行される
    // Activityをユーザが表示可能になる為に必要な処理や初期化を行う(DBからデータ取得、必要な情報を画面にセットする)
    // 割り込み処理の発生(アプリ表示宙に電話がくるなど)により、アプリが一次停止して、再開するとonResumeが実行される
    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "ResultActivityのonResumeが実行")
    }

    // アプリがバックグラウンドに移動したことを示すために実行される
    // Activityが一次停止状態
    // 処理を停止しておく時などに使用
    // 非常に短いのでデータの保存等は行わない
    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "ResultActivityのonPauseが実行")
    }

    // アプリが完全にバックグラウンドに移動した時に実行される
    // Activityは非表示になり、停止する
    // 不要なリソースを解放したり、アニメーションの停止などの処理の負荷を抑えるようなことを行う
    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "ResultActivityのonStopが実行")
    }

    // Activityの再表示の際に実行される
    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "ResultActivityのonRestartが実行")
    }

    // Activityが破棄される前に実行される
    // 画面構成の変更(回転やテーマ変更)されたときも実行される
    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "ResultActivityのonDestroyが実行")
    }
}