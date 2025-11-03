package org.emp.gl.timer.service;

import java.beans.PropertyChangeListener;

// Hérite de PropertyChangeListener au lieu de définir sa propre méthode
public interface TimerChangeListener extends PropertyChangeListener {

    final static String DIXEME_DE_SECONDE_PROP = "dixième";
    final static String SECONDE_PROP = "seconde";
    final static String MINUTE_PROP = "minute";
    final static String HEURE_PROP = "heure";

    // La méthode propertyChange(PropertyChangeEvent evt) 
    // est héritée de PropertyChangeListener
}