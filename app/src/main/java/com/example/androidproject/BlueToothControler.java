package com.example.androidproject;

import android.bluetooth.BluetoothAdapter;

/**
 * Bluetooth Adapter
 * Created by Huang & Yuan 29/03/2021
 */
public class BlueToothControler {
    private BluetoothAdapter myAdapter;

    public BlueToothControler(){
        myAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    /**
     * Verify whether bluetooth is supported
     * @return true = support, false = not support
     */
    public boolean isSupportBluetooth(){
        if(myAdapter != null){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Determining Bluetooth status
     * @return true = open, false = close
     */
    public boolean isBluetoothOn()
    {
        assert (myAdapter != null);
        return myAdapter.isEnabled();
    }

    /**
     * Turn on Bluetooth
     */
    public void openBluetooth(){
        myAdapter.enable();
    }

    /**
     * turn off bluetooth
     */
    public void closeBluetooth(){
        myAdapter.disable();
    }
}
