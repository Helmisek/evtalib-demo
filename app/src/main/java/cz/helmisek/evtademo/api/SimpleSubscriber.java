package cz.helmisek.evtademo.api;

import rx.Subscriber;


/**
 * Created by Jirka Helmich on 22.04.16.
 */
public abstract class SimpleSubscriber<T extends Object> extends Subscriber<T>
{
	@Override
	public void onCompleted()
	{
	}


	@Override
	public void onError(Throwable e)
	{
	}

}
