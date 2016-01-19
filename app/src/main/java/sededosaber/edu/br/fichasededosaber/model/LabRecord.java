package sededosaber.edu.br.fichasededosaber.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weslly on 19/01/16.
 */
public class LabRecord {
    private List<Record>  mRecords;
    public static LabRecord sLabRecord;

    private LabRecord(Context context){
        mRecords = new ArrayList<>();
        for(int i = 0;i<100;i++){
            Record record = new Record();
            record.setShift(Shift.AFTERNOON);
            record.setClassRoom("#" + i % 5);

            BirthCertificate birth = new BirthCertificate();
            birth.setName("#"+i+" weslly Lindemberg Costa");

            record.setCertificate(birth);

            mRecords.add(record);

        }

    }

    public static LabRecord getLabRecord(Context context){

        if(sLabRecord == null){
            sLabRecord =
                    new LabRecord(context.getApplicationContext());
        }

        return sLabRecord;
    }

    public List<Record> getRecords() {
        return mRecords;
    }
}