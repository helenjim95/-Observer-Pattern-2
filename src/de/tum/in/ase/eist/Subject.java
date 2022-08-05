package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//TODO: Subject class (Generic type)
public abstract class Subject<T> {

//	TODO: include a list/set of actual observers
	private final Set<Observer<T>> observers = new HashSet<>();

//	TODO: method to add/remove obeservers from list
	public void addObserver(Observer<T> observer) {
		Objects.requireNonNull(observer);
		observers.add(observer);
	}

	public void removeObserver(Observer<T> observer) {
		Objects.requireNonNull(observer);
		observers.remove(observer);
	}

	protected void notifyObservers(final T newState) {
		// TODO: Task 1.1: Iterate through the observers and notify every observer about the new state
		observers.forEach(observer -> observer.onUpdate(newState));
	}
}
