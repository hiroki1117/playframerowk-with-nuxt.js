<template>
  <section>
    {{getInfo}}
  </section>
</template>
<script lang="ts">
    import {
        Component,
        Prop,
        Vue
    } from "nuxt-property-decorator"

    @Component({})
    export default class Sample extends Vue {
        @Prop() info
        getInfo: string = this.info
    }
</script>
<style scoped>
</style>
