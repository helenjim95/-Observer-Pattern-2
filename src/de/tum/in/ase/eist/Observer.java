package de.tum.in.ase.eist;

// TODO: Observer interface (Generic type)
public interface Observer<T> {

	void onUpdate(T newState);
}
