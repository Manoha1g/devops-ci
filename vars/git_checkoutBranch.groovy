#!groovy	
def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [[$class: 'RelativeTargetDirectory',
                      relativeTargetDir: stageParams.relTargetDir],
                    [$class: 'CleanBeforeCheckout']],
        submoduleCfg: [],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
}
