package com.padeoe.njunet.connect.uihandler;

import android.os.Parcel;
import android.os.Parcelable;

import com.padeoe.nicservice.njuwlan.object.portal.ReturnData;
import com.padeoe.njunet.connect.MainActivity;
import com.padeoe.njunet.connect.StatusNotificationManager;
import com.padeoe.njunet.connect.controller.ConnectManager;

/**
 * Created by padeoe on 2016/5/10.
 */
public class OfflineHandle implements ConnectResultHandle {
    ReturnData returnData;

    public OfflineHandle(ReturnData returnData) {
        this.returnData = returnData;
    }

    @Override
    public void updateView(MainActivity mainActivity) {
        mainActivity.hideProgress();
      //  mainActivity.user_detail.setVisibility(View.INVISIBLE);
        System.out.println("离线处理");
        ConnectManager.setStatus(ConnectManager.Status.OFFLINE);
        StatusNotificationManager.showStatus();
        mainActivity.updateViewStatus(mainActivity.status, ConnectManager.getStatus());
        mainActivity.showOnMainActivity(returnData.getReply_message());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.returnData, flags);
    }

    protected OfflineHandle(Parcel in) {
        this.returnData = in.readParcelable(ReturnData.class.getClassLoader());
    }

    public static final Parcelable.Creator<OfflineHandle> CREATOR = new Parcelable.Creator<OfflineHandle>() {
        @Override
        public OfflineHandle createFromParcel(Parcel source) {
            return new OfflineHandle(source);
        }

        @Override
        public OfflineHandle[] newArray(int size) {
            return new OfflineHandle[size];
        }
    };
}
