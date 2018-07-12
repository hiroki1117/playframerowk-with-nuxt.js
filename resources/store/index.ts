export const state = () => ({
    info: ""
})

export const mutations = {
    setInfo(state, info) {
        state.info = info.status
    }
}

export const actions = {
    async nuxtServerInit({ commit }, { app }) {
        const info = await app.$axios.$get(
            "api"
        )
        commit("setInfo", info)
    }
}
