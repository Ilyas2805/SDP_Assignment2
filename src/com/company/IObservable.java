package com.company;

public interface IObservable {
    void registerPlayer(IObserver player);
    void unregisterPlayer(IObserver player);
    void notifyAllPlayers();
}
