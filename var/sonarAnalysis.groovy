def call(boolean abortPipeline = false) {
    def branchName = env.BRANCH_NAME // Obtener el nombre de la rama desde la variable de entorno

    if (abortPipeline || branchName == 'master' || branchName.startsWith('hotfix')) {
        error("QualityGate failed! Aborting the pipeline.")
    } else {
        echo "QualityGate passed. Continuing the pipeline."
    }
}
