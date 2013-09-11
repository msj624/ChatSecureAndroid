package info.guardianproject.otr.app.im.engine;

import info.guardianproject.otr.OtrDataHandler.Transfer;

public interface DataListener {
    void onTransferComplete(Address from, String url, String type, byte[] data);

    void onTransferFailed(Address from, String url, String reason);

    void onTransferProgress(Address from, String url, float f);
    
    void onTransferRequested(Transfer transfer);
    
}
