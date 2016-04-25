package cz.helmisek.evtademo.adapter.viewmodel;

import android.util.Log;
import android.view.View;

import cz.helmisek.evtademo.databinding.UserItemBinding;
import cz.helmisek.evtademo.entity.UserEntity;
import cz.helmisek.evtalibrary.viewmodel.BaseAdapterViewModel;


/**
 * Created by Jirka Helmich on 22.04.16.
 */
public class UserItemViewModel extends BaseAdapterViewModel<UserEntity, UserItemBinding>
{
	public UserItemViewModel(UserEntity object, UserItemBinding binding, int position)
	{
		super(object, binding, position);

		getBinding().userItemTitle.setText(object.getName());
	}


	@Override
	public void onItemClick(View v)
	{
		Log.v("Title", getDataObject().getName());
	}
}
