package com.example.rxjava;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

public class CallReceiver extends CallRecever{

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        super.onIncomingCallEnded(ctx, number, start, end);

        showToast(ctx,"Call incom ended"+number);
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
        super.onOutgoingCallEnded(ctx, number, start, end);
        showToast(ctx,"Call outgoing ended"+number);
    }

    @Override
    protected void onIncomingCallStarted(Context ctx, String number, Date start) {
        super.onIncomingCallStarted(ctx, number, start);
        showToast(ctx,"Call incom started"+number);
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        super.onOutgoingCallStarted(ctx, number, start);
        showToast(ctx,"Call outcome started"+number);
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
        super.onMissedCall(ctx, number, start);
        showToast(ctx,"missed cll"+number);
    }

    void showToast(Context context,String message){
        Toast toast=Toast.makeText( context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
