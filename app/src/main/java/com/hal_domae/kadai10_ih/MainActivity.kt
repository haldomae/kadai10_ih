package com.hal_domae.kadai10_ih

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Activityが生成されるときに実行される
    // 最初にしか実行しない
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LifeCycle", "MainActivityのonCreateが実行")
        // アプリのヘッダーを表示するかどうか
        // フルスクリーンで表示できる
        enableEdgeToEdge()
        // レイアウトの設定(どのXMLを使うか)
        setContentView(R.layout.activity_main)
        // アプリの画面がステータスバーやナビゲーションバーに重ならないようにする
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
        Log.i("LifeCycle", "MainActivityのonStartが実行")
    }

    // Activityが前面に表示され、ユーザとのやり取りが可能になる直前に実行される
    // Activityをユーザが表示可能になる為に必要な処理や初期化を行う(DBからデータ取得、必要な情報を画面にセットする)
    // 割り込み処理の発生(アプリ表示宙に電話がくるなど)により、アプリが一次停止して、再開するとonResumeが実行される
    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "MainActivityのonResumeが実行")
    }
}