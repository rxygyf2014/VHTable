package com.demo.zj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.zj.vhtableview.VHTableView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置数据源
        VHTableView vht_table=(VHTableView)findViewById(R.id.vht_table);
        ArrayList<String> titleData=new ArrayList<>();
        titleData.add("序号");
        titleData.add("第一列");
        titleData.add("第二列");
        titleData.add("第三列");
        titleData.add("第四列");
        titleData.add("第五列");
        titleData.add("第六列");
        titleData.add("第七列");
        titleData.add("第八列");
        titleData.add("第九列");


        ArrayList<ArrayList<String>> contentData=new ArrayList<>();



        for(int i=1;i<200;i++){
            ArrayList<String> contentRowData=new ArrayList<>();
            if(i<10) {
                contentRowData.add("0" + i);
            }else {
                contentRowData.add(i+"");
            }
            contentRowData.add("第"+i+"行第一列");
            contentRowData.add("第"+i+"行第二列");
            contentRowData.add("第"+i+"行第三列");
            contentRowData.add("第"+i+"行第四列");
            contentRowData.add("第"+i+"行第五列");
            contentRowData.add("第"+i+"行第六列");
            contentRowData.add("第"+i+"行第七列");
            contentRowData.add("第"+i+"行第八列");
            contentRowData.add("第"+i+"行第九列");

            contentData.add(contentRowData);
        }

        VHTableAdapter tableAdapter=new VHTableAdapter(this,titleData,contentData);
        //vht_table.setFirstColumnIsMove(true);//设置第一列是否可移动,默认不可移动
        //vht_table.setShowTitle(false);//设置是否显示标题行,默认显示
        //一般表格都只是展示用的，所以这里没做刷新，真要刷新数据的话，重新setadaper一次吧
        vht_table.setAdapter(tableAdapter);
    }
}
