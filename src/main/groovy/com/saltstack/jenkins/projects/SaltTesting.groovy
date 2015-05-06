package com.saltstack.jenkins.projects

import com.saltstack.jenkins.Project

final class SaltTesting extends Project {

    SaltTesting() {
        super()
        this.name = 'salt-testing'
        this.display_name = 'Salt Testing'
        this.repo = 'saltstack/salt-testing'
    }

}
