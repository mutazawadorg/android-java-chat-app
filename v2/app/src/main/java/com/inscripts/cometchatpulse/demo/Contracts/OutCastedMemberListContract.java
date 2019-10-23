package com.inscripts.cometchatpulse.demo.Contracts;

import android.content.Context;

import com.inscripts.cometchatpulse.demo.Adapter.GroupMemberListAdapter;
import com.inscripts.cometchatpulse.demo.Base.BasePresenter;
import com.cometchat.pro.models.GroupMember;
import com.cometchat.pro.models.GroupMember;

import java.util.HashMap;
import java.util.List;

public interface OutCastedMemberListContract {

    interface OutCastedMemberListView{

        void setAdapter(HashMap<String ,GroupMember> list);
    }

    interface OutCastedMemberListPresenter extends BasePresenter<OutCastedMemberListView>
    {

        void initMemberList(String groupId, int limit, Context context);

        void reinstateUser(String uid, String groupId, GroupMemberListAdapter groupMemberListAdapter);

        void refresh(String GUID,int LIMIT,Context context);
    }


}