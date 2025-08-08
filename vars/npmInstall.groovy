#!/usr/bin/env groovy

/**
 * Installs npm dependencies
 * @param args Optional arguments to npm install (e.g., '--production')
 */
def call(String args = '') {
    echo "Running npm install ${args}"
    sh "npm install ${args}"
}