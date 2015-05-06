package com.saltstack.jenkins.projects

import com.saltstack.jenkins.Project

final class SaltPyLint extends Project {

    SaltPyLint() {
        super()
        this.name = 'salt-pylint'
        this.display_name = 'Salt PyLint Plugins'
        this.repo = 'saltstack/salt-pylint'
    }

}
